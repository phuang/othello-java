/* Othello
 * Copyright (C) 1999,2007 Huang Peng <shawn.p.huang@gmail.com>
 *
 * Othello.java
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */
package hp.game.othello;

import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JTextPane;

public class HelpDialog extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3995682499949857144L;
	static private String text = 
			"<html>" +
			"<body>" +
			"<h1>Othello Help</h1><br>" +
			"<b>Mouse left button:</b>  put a chess<br>" + 
			"<b>Mouse right button:</b> give up a step<br>" +
			"<a href='mailto:shawn.p.huang@gmail.com'>Author: Huang Peng</a><br>" +
			"<a href='mailto:shawn.p.huang@gmail.com'>Email: shawn.p.huang@gmail.com</a><br>" +
			"</body></html>";
	private JTextPane textPane = new JTextPane ();
	
	public HelpDialog (Frame parent) {
		super (parent);
		setModal (true);
		textPane.setEditable(false);
		setSize(400, 200);
		textPane.setContentType("text/html");
		textPane.setText(text);
		this.add(textPane);
		this.setLocationRelativeTo(parent);
	}
}
