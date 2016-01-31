package com.vaadin.gwtdemo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 */
@Theme(GwtDemoUI.THEME)
@Widgetset("com.vaadin.gwtdemo.GwtDemoWidgetset")
public class GwtDemoUI extends UI {
    
    public static final String THEME = "gwtdemo";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        
        // For some reason this is not performed correctly in the bootstrap
        String js =
                "l = document.createElement('link');" +
                "l.rel = 'stylesheet';" +
                "l.href = 'VAADIN/themes/" + THEME + "/styles.css';" +
                "document.body.appendChild(l);" +
                "document.body.classList.add('" + THEME + "')";
        JavaScript.eval(js);
        
        
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "GwtDemoUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = GwtDemoUI.class, productionMode = false)
    public static class GwtDemoUIServlet extends VaadinServlet {
    }
}
