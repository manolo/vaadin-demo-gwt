/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEventHandler;
import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEventHandler;
import com.vaadin.polymer.paper.PaperSliderElement;
import com.vaadin.polymer.paper.widget.event.ChangeEvent;
import com.vaadin.polymer.paper.widget.event.ChangeEventHandler;
import com.vaadin.polymer.paper.widget.event.ImmediateValueChangeEvent;
import com.vaadin.polymer.paper.widget.event.ImmediateValueChangeEventHandler;
import com.vaadin.polymer.paper.widget.event.ValueChangeEvent;
import com.vaadin.polymer.paper.widget.event.ValueChangeEventHandler;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/sliders.html">Sliders</a></p>
 * <p><code>paper-slider</code> allows user to select a value from a range of values by<br>moving the slider thumb.  The interactive nature of the slider makes it a<br>great choice for settings that reflect intensity levels, such as volume,<br>brightness, or color saturation.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-slider&gt;&lt;/paper-slider&gt;
 * 
 * 
 * </code></pre><p>Use <code>min</code> and <code>max</code> to specify the slider range.  Default is 0 to 100.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-slider min=&quot;10&quot; max=&quot;200&quot; value=&quot;110&quot;&gt;&lt;/paper-slider&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-slider-bar-color</code></td>
 * <td>The background color of the slider</td>
 * <td><code>transparent</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-active-color</code></td>
 * <td>The progress bar color</td>
 * <td><code>--google-blue-700</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-secondary-color</code></td>
 * <td>The secondary progress bar color</td>
 * <td><code>--google-blue-300</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-color</code></td>
 * <td>The knob color</td>
 * <td><code>--google-blue-700</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-knob-color</code></td>
 * <td>The disabled knob color</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-pin-color</code></td>
 * <td>The pin color</td>
 * <td><code>--google-blue-700</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-font-color</code></td>
 * <td>The pin’s text color</td>
 * <td><code>#fff</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-active-color</code></td>
 * <td>The disabled progress bar color</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-secondary-color</code></td>
 * <td>The disabled secondary progress bar color</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-start-color</code></td>
 * <td>The fill color of the knob at the far left</td>
 * <td><code>transparent</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-start-border-color</code></td>
 * <td>The border color of the knob at the far left</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-pin-start-color</code></td>
 * <td>The color of the pin at the far left</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-height</code></td>
 * <td>Height of the progress bar</td>
 * <td><code>2px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-input</code></td>
 * <td>Mixin applied to the input in editable mode</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperSlider extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperSlider() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperSlider(String html) {
        super(PaperSliderElement.TAG, PaperSliderElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperSliderElement getPolymerElement() {
        try {
            return (PaperSliderElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    public JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property markers
     * @type Array
     * 
     */
    public JsArray getMarkers() {
        return getPolymerElement().getMarkers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property markers
     * @type Array
     * 
     */
    public void setMarkers(JsArray value) {
        getPolymerElement().setMarkers(value);
    }

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    public JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getNoink() {
        return getPolymerElement().getNoink();
    }
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperTab
     */
    public void setNoink(boolean value) {
        getPolymerElement().setNoink(value);
    }

    /**
     * <p>If true, a pin with numeric value label is shown when the slider thumb<br>is pressed. Use for settings for which users need to know the exact<br>value of the setting.</p>
     *
     * JavaScript Info:
     * @property pin
     * @type Boolean
     * 
     */
    public boolean getPin() {
        return getPolymerElement().getPin();
    }
    /**
     * <p>If true, a pin with numeric value label is shown when the slider thumb<br>is pressed. Use for settings for which users need to know the exact<br>value of the setting.</p>
     *
     * JavaScript Info:
     * @property pin
     * @type Boolean
     * 
     */
    public void setPin(boolean value) {
        getPolymerElement().setPin(value);
    }

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getActive() {
        return getPolymerElement().getActive();
    }
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }

    /**
     * <p>If true, the slider thumb snaps to tick marks evenly spaced based<br>on the <code>step</code> property value.</p>
     *
     * JavaScript Info:
     * @property snaps
     * @type Boolean
     * 
     */
    public boolean getSnaps() {
        return getPolymerElement().getSnaps();
    }
    /**
     * <p>If true, the slider thumb snaps to tick marks evenly spaced based<br>on the <code>step</code> property value.</p>
     *
     * JavaScript Info:
     * @property snaps
     * @type Boolean
     * 
     */
    public void setSnaps(boolean value) {
        getPolymerElement().setSnaps(value);
    }

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPointerDown() {
        return getPolymerElement().getPointerDown();
    }
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public void setPointerDown(boolean value) {
        getPolymerElement().setPointerDown(value);
    }

    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPressed() {
        return getPolymerElement().getPressed();
    }
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public void setPressed(boolean value) {
        getPolymerElement().setPressed(value);
    }

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getReceivedFocusFromKeyboard() {
        return getPolymerElement().getReceivedFocusFromKeyboard();
    }
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public void setReceivedFocusFromKeyboard(boolean value) {
        getPolymerElement().setReceivedFocusFromKeyboard(value);
    }

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getToggles() {
        return getPolymerElement().getToggles();
    }
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public void setToggles(boolean value) {
        getPolymerElement().setToggles(value);
    }

    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>If true, an input is shown and user can use it to set the slider value.</p>
     *
     * JavaScript Info:
     * @property editable
     * @type Boolean
     * 
     */
    public boolean getEditable() {
        return getPolymerElement().getEditable();
    }
    /**
     * <p>If true, an input is shown and user can use it to set the slider value.</p>
     *
     * JavaScript Info:
     * @property editable
     * @type Boolean
     * 
     */
    public void setEditable(boolean value) {
        getPolymerElement().setEditable(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property transiting
     * @type Boolean
     * 
     */
    public boolean getTransiting() {
        return getPolymerElement().getTransiting();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property transiting
     * @type Boolean
     * 
     */
    public void setTransiting(boolean value) {
        getPolymerElement().setTransiting(value);
    }

    /**
     * <p>If true, the knob is expanded</p>
     *
     * JavaScript Info:
     * @property expand
     * @type Boolean
     * 
     */
    public boolean getExpand() {
        return getPolymerElement().getExpand();
    }
    /**
     * <p>If true, the knob is expanded</p>
     *
     * JavaScript Info:
     * @property expand
     * @type Boolean
     * 
     */
    public void setExpand(boolean value) {
        getPolymerElement().setExpand(value);
    }

    /**
     * <p>True when the user is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public boolean getDragging() {
        return getPolymerElement().getDragging();
    }
    /**
     * <p>True when the user is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public void setDragging(boolean value) {
        getPolymerElement().setDragging(value);
    }

    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    public double getStep() {
        return getPolymerElement().getStep();
    }
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    public void setStep(double value) {
        getPolymerElement().setStep(value);
    }

    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    public double getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    public void setValue(double value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @property maxMarkers
     * @type Number
     * 
     */
    public double getMaxMarkers() {
        return getPolymerElement().getMaxMarkers();
    }
    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @property maxMarkers
     * @type Number
     * 
     */
    public void setMaxMarkers(double value) {
        getPolymerElement().setMaxMarkers(value);
    }

    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property immediateValue
     * @type Number
     * 
     */
    public double getImmediateValue() {
        return getPolymerElement().getImmediateValue();
    }
    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property immediateValue
     * @type Number
     * 
     */
    public void setImmediateValue(double value) {
        getPolymerElement().setImmediateValue(value);
    }

    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    public double getSecondaryProgress() {
        return getPolymerElement().getSecondaryProgress();
    }
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    public void setSecondaryProgress(double value) {
        getPolymerElement().setSecondaryProgress(value);
    }

    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    public double getRatio() {
        return getPolymerElement().getRatio();
    }
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    public void setRatio(double value) {
        getPolymerElement().setRatio(value);
    }

    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    public double getMax() {
        return getPolymerElement().getMax();
    }
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    public void setMax(double value) {
        getPolymerElement().setMax(value);
    }

    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    public double getMin() {
        return getPolymerElement().getMin();
    }
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    public void setMin(double value) {
        getPolymerElement().setMin(value);
    }

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public String getAriaActiveAttribute() {
        return getPolymerElement().getAriaActiveAttribute();
    }
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public void setAriaActiveAttribute(String value) {
        getPolymerElement().setAriaActiveAttribute(value);
    }

    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinComboBox
     */
    public String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinComboBox
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinComboBox
     */
    public void setKeyBindings(String value) {
        getPolymerElement().setAttribute("key-bindings", value);
    }

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinComboBox
     */
    public void setKeyEventTarget(String value) {
        getPolymerElement().setAttribute("key-event-target", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute markers
     * 
     */
    public void setMarkers(String value) {
        getPolymerElement().setAttribute("markers", value);
    }

    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @attribute max
     * @behavior PaperSlider
     */
    public void setMax(String value) {
        getPolymerElement().setAttribute("max", value);
    }

    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @attribute step
     * @behavior PaperSlider
     */
    public void setStep(String value) {
        getPolymerElement().setAttribute("step", value);
    }

    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @attribute value
     * @behavior PaperSlider
     */
    public void setValue(String value) {
        getPolymerElement().setAttribute("value", value);
    }

    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @attribute max-markers
     * 
     */
    public void setMaxMarkers(String value) {
        getPolymerElement().setAttribute("max-markers", value);
    }

    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @attribute immediate-value
     * 
     */
    public void setImmediateValue(String value) {
        getPolymerElement().setAttribute("immediate-value", value);
    }

    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @attribute secondary-progress
     * 
     */
    public void setSecondaryProgress(String value) {
        getPolymerElement().setAttribute("secondary-progress", value);
    }

    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @attribute ratio
     * @behavior PaperSlider
     */
    public void setRatio(String value) {
        getPolymerElement().setAttribute("ratio", value);
    }

    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @attribute min
     * @behavior PaperSlider
     */
    public void setMin(String value) {
        getPolymerElement().setAttribute("min", value);
    }


    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinComboBox
     * 
     */
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior VaadinComboBox
     * 
     */
    public void keyboardEventMatchesKeys(Object event, Object eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }

    /**
     * <p>Increases value by <code>step</code> but not above <code>max</code>.</p>
     *
     * JavaScript Info:
     * @method increment
     * 
     * 
     */
    public void increment() {
        getPolymerElement().increment();
    }

    /**
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    public boolean hasRipple() {
        return getPolymerElement().hasRipple();
    }

    /**
     * <p>Decreases value by <code>step</code> but not below <code>min</code>.</p>
     *
     * JavaScript Info:
     * @method decrement
     * 
     * 
     */
    public void decrement() {
        getPolymerElement().decrement();
    }

    /**
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * @behavior PaperToggleButton
     * 
     */
    public void getRipple() {
        getPolymerElement().getRipple();
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinComboBox
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperToggleButton
     * 
     */
    public void ensureRipple(JavaScriptObject optTriggeringEvent) {
        getPolymerElement().ensureRipple(optTriggeringEvent);
    }


    /**
     * <p>Fired when the slider’s value changes due to user interaction.</p>
     * <p>Changes to the slider’s value due to changes in an underlying<br>bound variable will not trigger this event.</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addDomHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the slider’s immediateValue changes.</p>
     *
     * JavaScript Info:
     * @event immediate-value-change
     */
    public HandlerRegistration addImmediateValueChangeHandler(ImmediateValueChangeEventHandler handler) {
        return addDomHandler(handler, ImmediateValueChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the slider’s value changes.</p>
     *
     * JavaScript Info:
     * @event value-change
     */
    public HandlerRegistration addValueChangeHandler(ValueChangeEventHandler handler) {
        return addDomHandler(handler, ValueChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the element is added to an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-register
     */
    public HandlerRegistration addIronFormElementRegisterHandler(IronFormElementRegisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementRegisterEvent.TYPE);
    }

    /**
     * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-unregister
     */
    public HandlerRegistration addIronFormElementUnregisterHandler(IronFormElementUnregisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementUnregisterEvent.TYPE);
    }

}
