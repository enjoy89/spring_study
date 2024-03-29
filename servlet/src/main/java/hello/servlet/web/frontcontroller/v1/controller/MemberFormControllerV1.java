package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ControllerV1 인터페이스의 구현체
 * 회원 등록 Controller
 */
public class MemberFormControllerV1 implements ControllerV1 {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";    // WER-INF -> 외부에서 호출이 불가능하고 컨트롤러를 통해서만 JSP 호출 가능
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);// controller에서 view로 이동할 때 쓰임
        dispatcher.forward(request, response); // servlet에서 jsp 호출
    }
}
