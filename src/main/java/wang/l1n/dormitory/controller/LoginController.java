package wang.l1n.dormitory.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wang.l1n.dormitory.service.ManagerService;
import wang.l1n.dormitory.utils.EncryptionUtils;

import javax.servlet.http.HttpSession;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/21 12:30
 * @description：
 */
@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    ManagerService managerService;

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/")
    public String indexToLogin() {
        return "login";
    }



    /**
     * 处理登录请求
     * @param username
     * @param password
     * @param model
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String doLogin(String username, String password, Model model, HttpSession httpSession,Boolean rememberMe){

        if (rememberMe == null){
            rememberMe = false;
        }
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()){
            String credentials = EncryptionUtils.getMD5(String.valueOf(password));
            UsernamePasswordToken token = new UsernamePasswordToken(username,credentials);
            token.setRememberMe(rememberMe);
            try {
                currentUser.login(token);
            } catch (UnknownAccountException e) {
                model.addAttribute("msg", "用户名不存在");
                return "login";
            } catch (IncorrectCredentialsException e) {
                model.addAttribute("msg", "用户名或密码错误");
                return "login";
            } catch (AuthenticationException e){
                model.addAttribute("msg", "未知错误");
                return "login";
            }
        }
        //认证通过
        httpSession.setAttribute("username", username);
        return "redirect:main";
    }

    /**
     * 处理注销请求
     * @return
     */
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null){
            subject.logout();
        }
        return "redirect:login";
    }
}
