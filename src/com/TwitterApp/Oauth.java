package com.TwitterApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.TreeMap;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Servlet implementation class Oauth
 */
@WebServlet(name = "Oauth", urlPatterns = { "/oauth" })
public class Oauth extends HttpServlet {
	private static final long serialVersionUID = 1L;
  private String API_key = "WOb0qHqJkttrUyYaBfFI2YNN7";
  private String API_secret = "ysjxfE5dzqYJyHPFdzBCYnLnrJvDr3g9FPgj60oTZwIZG7erBU";
	private String request_url = "http://hogehoge.jp";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oauth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  TreeMap<String,String> params = new TreeMap<String,String>();
	  String API_key_encode = URLEncoder.encode(API_key, "UTF-8");
	  String API_secret_encode = URLEncoder.encode(API_secret, "UTF-8");
	  String signeture_key = API_key_encode + API_secret_encode;
	  
	  params.put("oauth_callback", request_url);
	  params.put("oauth_consumer_key", API_key);
	  params.put("oauth_signature_method", "HMAC-SHA1");
	  params.put("oauth_timestamp",String.valueOf(System.currentTimeMillis()/1000));
	  params.put("oauth_nonce", RandomStringUtils.randomAlphanumeric(16));
	  params.put("oauth_version", "1.0");
	  
	  
	  //request.getAttribute();
	}

}
