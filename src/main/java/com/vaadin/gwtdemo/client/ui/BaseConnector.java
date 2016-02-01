package com.vaadin.gwtdemo.client.ui;

import com.google.gwt.query.client.GQ;
import com.google.gwt.query.client.IsProperties;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.elemental.HTMLElement;


@SuppressWarnings("serial")
public abstract class BaseConnector extends AbstractComponentConnector {
    
    public abstract String[] getEvents();
    EventListener<?> listener = new EventListener<Event>() {
        public void handleEvent(Event event) {
            getRpcProxy(EventServerRpc.class).stateChanged(event.getType(), stateProperties().toJson());
        }
    };
    
    public BaseConnector() {
        for (String eventName : getEvents()) {
            ((HTMLElement)getWidget().getElement()).addEventListener(eventName, listener);
        }
    }

    public IsProperties stateProperties() { 
        return GQ.create();
    }

    @Override
    public PolymerWidget getWidget() {
        return (PolymerWidget)super.getWidget();
    }
}