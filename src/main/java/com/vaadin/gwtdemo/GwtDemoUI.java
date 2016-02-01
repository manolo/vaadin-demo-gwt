package com.vaadin.gwtdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.jsoup.nodes.Element;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.gwtdemo.components.BaseComponent.EventListener;
import com.vaadin.gwtdemo.components.PaperSliderComponent;
import com.vaadin.server.BootstrapFragmentResponse;
import com.vaadin.server.BootstrapListener;
import com.vaadin.server.BootstrapPageResponse;
import com.vaadin.server.ServiceException;
import com.vaadin.server.SessionInitEvent;
import com.vaadin.server.SessionInitListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 */
@Theme(GwtDemoUI.THEME)
@Widgetset(GwtDemoUI.WIDGETSET)
public class GwtDemoUI extends UI {
    
    public static final String THEME = "gwtdemo";
    public static final String WIDGETSET = "com.vaadin.gwtdemo.GwtDemoWidgetset";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        
        final VerticalLayout layout = new VerticalLayout();
        
        
        PaperSliderComponent p = new PaperSliderComponent();
        layout.addComponent(p);
        
        p.addChangeHandler(new EventListener() {
            public void onBrowserEvent(String eventName) {
//                sliderLabel.setCaption("" + slider.value());
            }
        });
        
//        final TextField name = new TextField();
//        name.setCaption("Type your name here:");
//
//        Button button = new Button("Click Me");
//        button.addClickListener( e -> {
//            layout.addComponent(new Label("Thanks " + name.getValue() 
//                    + ", it works!"));
//        });
//        
//        layout.addComponents(name, button);
//        layout.setMargin(true);
//        layout.setSpacing(true);
//        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "GwtDemoUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = GwtDemoUI.class, productionMode = false)
    public static class GwtDemoUIServlet extends VaadinServlet {
        @Override
        protected void servletInitialized() throws ServletException {
            super.servletInitialized();
            getService().addSessionInitListener(new SessionInitListener() {
                public void sessionInit(SessionInitEvent event) throws ServiceException {
                    event.getSession().addBootstrapListener(new BootstrapListener() {
                        public void modifyBootstrapPage(BootstrapPageResponse response) {
                            
                            Element head = response.getDocument().head();
//                            head.appendElement("script")
//                                .attr("src", "VAADIN/widgetsets/" + WIDGETSET + "/bower_components/webcomponentsjs/webcomponents-lite.js");
                            
                            head.appendElement("link")
                                .attr("rel", "stylesheet")
                                .attr("href", "VAADIN/themes/" + THEME + "/styles.css");
                            
                            Element body = response.getDocument().body();
                            body.addClass(THEME);
                        }
                        public void modifyBootstrapFragment(BootstrapFragmentResponse response) {
                        }
                    });
                }
            });
        }        
    }
}
