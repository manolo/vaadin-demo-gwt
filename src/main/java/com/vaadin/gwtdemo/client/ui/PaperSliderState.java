package com.vaadin.gwtdemo.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.shared.AbstractFieldState;

@SuppressWarnings("serial")
public class PaperSliderState extends AbstractFieldState {
    public double value = 0;
    public double min = 0;
    public double max = 100;
    public double step = 1;
    public double ratio = 0;
    public boolean snaps = false;
    public boolean pin = false;
    public boolean disabled = false;
    public double secondaryProgress = 0;
    public boolean editable = false;
    public double immediateValue = 0;
    public List<String> handlerNames = new ArrayList<>();
}