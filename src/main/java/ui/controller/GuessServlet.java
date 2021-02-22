package ui.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.GuessGame;

@WebServlet("/Guess")
public class GuessServlet extends HttpServlet {

	private GuessGame game = new GuessGame();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String guessFromParameter = request.getParameter("guess"); 
		int guessedNumber = Integer.parseInt(guessFromParameter);

		request.setAttribute("result", game.guess(guessedNumber));
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
