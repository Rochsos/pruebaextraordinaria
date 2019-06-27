package com.prueba.prueba_dis;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	ArrayList<clase> Tweets = new ArrayList<clase>();
	
	@Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField nombre = new TextField();
        nombre.setCaption("Escribe tu nombre aquí:");
        
        final TextField mensaje = new TextField();
        mensaje.setCaption("Escribe tu mensaje aquí:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            
        	Date fecha = new Date();
        	
        	layout.addComponent(new Label("Thanks " + nombre.getValue() 
                    + ", it works!"));
        	
        	layout.addComponent(new Label("Tweet: " + mensaje.getValue()));
            
            layout.addComponent(new Label("Fecha: " + fecha));
            
            clase nuevo = new clase(nombre, mensaje, fecha);
        	
        	Tweets.add(nuevo);
        });
        
        layout.addComponents(nombre, mensaje, button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
