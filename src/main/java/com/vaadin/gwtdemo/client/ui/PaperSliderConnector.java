package com.vaadin.gwtdemo.client.ui;

import com.google.gwt.query.client.IsProperties;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.gwtdemo.components.PaperSliderComponent;
import com.vaadin.polymer.paper.widget.PaperSlider;
import com.vaadin.shared.ui.Connect;

@SuppressWarnings("serial")
@Connect(PaperSliderComponent.class)
public class PaperSliderConnector extends BaseConnector {

    public IsProperties stateProperties() {
        getState().value = getWidget().getValue();
        getState().min = getWidget().getMin();
        getState().max = getWidget().getMax();
        getState().step = getWidget().getStep();
        getState().ratio = getWidget().getRatio();
        getState().snaps = getWidget().getSnaps();
        getState().pin = getWidget().getPin();
        getState().disabled = getWidget().getDisabled();
        getState().secondaryProgress = getWidget().getSecondaryProgress();
        getState().editable = getWidget().getEditable();
        getState().immediateValue = getWidget().getImmediateValue();

        IsProperties p = super.stateProperties();
        p.set("value", getState().value);
        p.set("min", getState().min);
        p.set("max", getState().max);
        p.set("step", getState().step);
        p.set("ratio", getState().ratio);
        p.set("snaps", getState().snaps);
        p.set("pin", getState().pin);
        p.set("disabled", getState().disabled);
        p.set("secondaryProgress", getState().secondaryProgress);
        p.set("editable", getState().editable);
        p.set("immediateValue", getState().immediateValue);
        return p;
    }

    @Override
    public PaperSlider getWidget() {
        return (PaperSlider) super.getWidget();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        getWidget().setValue(getState().value);
        getWidget().setMin(getState().min);
        getWidget().setMax(getState().max);
        getWidget().setStep(getState().step);
        getWidget().setRatio(getState().ratio);
        getWidget().setSnaps(getState().snaps);
        getWidget().setPin(getState().pin);
        getWidget().setDisabled(getState().disabled);
        getWidget().setSecondaryProgress(getState().secondaryProgress);
        getWidget().setEditable(getState().editable);
        getWidget().setImmediateValue(getState().immediateValue);
    }

    @Override
    public PaperSliderState getState() {
        return (PaperSliderState) super.getState();
    }
}
