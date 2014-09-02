package com.codenvy.ide.tutorial.action.client.inject;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Timer;


/**
 * Wrapper around functionality used to inject external Javascript code into
 * your application.
 * 
 * @author Sohani
 */
public class ESBJavaScriptInjector {

    private static HeadElement head;

    public static void inject(String javascript) {
        
        HeadElement head = getHead();
        new Timer() {
            
            public void run() {
               // goJsPlumb();
                getInsideIframe();
            }
        }.schedule(1);
        
   
        ScriptElement element = createScriptElement();
        element.setText(javascript);
        head.appendChild(element);
    }





public static native void getInsideIframe() /*-{
       // $wnd.alert("starting....");
        
        var t1 = $doc.getElementById('contactForm');
         var iframe =   $('contactForm').contents().find('MyIframe')
        
        $wnd.alert("My Name is Khan.. : "+ t1);
       
    }-*/;

  
   
    private static ScriptElement createScriptElement() {
        ScriptElement script = Document.get().createScriptElement();
        script.setAttribute("language", "javascript");
        return script;
        
    }

    private static HeadElement getHead() {
         if (head == null) {
               Element element = Document.get().getElementsByTagName("head").getItem(0);
               //Window.alert("Head element"+ element.getString());
               assert element != null : "HTML Head element required";
               HeadElement head = HeadElement.as(element);
               ESBJavaScriptInjector.head = head;
      }
         return ESBJavaScriptInjector.head;
         }
}
