package com.example.demo;

import java.sql.Connection;

public class LoginServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
    
    DbUtil dbUtil=new DbUtil();
    UserD userDao=new UserD();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        User user=new User(userName,password);
        Connection con=null;
        try {
            //连接数据库
            con=dbUtil.getCon();
            User currentUser=userDao.userLogin(con, user);
            if(currentUser==null){
                request.setAttribute("error", "账号或密码错误");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("main.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                //关闭数据库
                dbUtil.closeCon(con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
