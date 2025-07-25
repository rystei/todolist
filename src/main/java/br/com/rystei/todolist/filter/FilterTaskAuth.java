package br.com.rystei.todolist.filter;

import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
                
                var authorization = request.getHeader("authorization");

                var authEncoded = authorization.substring("Bacic".length()).trim();

                byte[] authDecode = Base64.getDecoder().decode(authEncoded);

                var authString = new String(authDecode);

                String[] creadentials = authString.split(":");
                String username = creadentials[0];
                String password = creadentials[1];
                System.out.println("Authorization");
                System.out.println(username);
                System.out.println(password);
                

                filterChain.doFilter(request, response);
    }


    
}
