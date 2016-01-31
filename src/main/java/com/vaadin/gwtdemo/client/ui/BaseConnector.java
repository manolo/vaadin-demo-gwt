package com.vaadin.gwtdemo.client.ui;

import com.google.gwt.query.client.GQ;
import com.google.gwt.query.client.IsProperties;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.polymer.PolymerWidget;


@SuppressWarnings("serial")
public abstract class BaseConnector extends AbstractComponentConnector implements EventListener {

    public BaseConnector() {
//        getWidget().addChangeHandler(this);
//        getWidget().addClickHandler(this);
    }

    public IsProperties stateProperties() {
        return GQ.create();
    }

    @Override
    public PolymerWidget getWidget() {
        return (PolymerWidget)super.getWidget();
    }

    @Override
    public void onBrowserEvent(Event event) {
        getRpcProxy(EventServerRpc.class).stateChanged(event.getType(), stateProperties().toJson());
    }
}