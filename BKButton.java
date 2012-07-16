// Decompiled by DJ v3.9.9.91 Copyright 2005 Atanas Neshkov  Date: 22.11.2009 21:52:27
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) definits fieldsfirst ansi space 
// Source File Name:   BKButton.java

package vl.tool.vega.BKGUI;

import java.awt.Insets;
import javax.swing.JButton;

// Referenced classes of package vega.BKGUI:
//            Const

public class BKButton extends JButton
{

    public BKButton(String label)
    {
        super(label);
        setFocusable(false);
        setFont(getFont().deriveFont(0));
        setMargin(new Insets(2, 2, 2, 2));
        setBorder(Const.borderRaised);
    }
}