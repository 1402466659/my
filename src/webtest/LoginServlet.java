package webtest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决请求乱码
        req.setCharacterEncoding("UTF-8");
        //通过req请求对象取出前台提交的用户名和密码参数
       String username = req.getParameter("username");
       String password =req.getParameter("password");

        //将用户名存入request对象
//        req.setAttribute("username",username);
//        //（服务器）跳转，url地址不变
//        req.getRequestDispatcher("index.jsp").forward(req,resp);


        //获取session对象
        HttpSession session =req.getSession();
        session.setAttribute("username",username);
        resp.sendRedirect("index.jsp");

        System.out.println(username);
        System.out.println(password);
    }

}
