/* Othello
 * Copyright (C) 1999,2007 Huang Peng <shawn.p.huang@gmail.com>
 *
 * OthelloLet.java : An applet
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

import java.applet.*;
import java.awt.*;

/**
 * <p>
 * Title: Othello
 * </p>
 * <p>
 * Description: Game
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Huang Peng
 * @version 1.0
 */

public class OthelloLet extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7382440775895678448L;
	private boolean isStandalone = false;
	Othello othello = new Othello();
	BorderLayout borderLayout1 = new BorderLayout();

	// Get a parameter value
	public String getParameter(String key, String def) {
		return isStandalone ? System.getProperty(key, def)
				: (getParameter(key) != null ? getParameter(key) : def);
	}

	// Construct the applet
	public OthelloLet() {
	}

	// Initialize the applet
	public void init() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		othello.applet = this;
	}

	// Component initialization
	private void jbInit() throws Exception {
		this.setLayout(borderLayout1);
		othello.setBackground(SystemColor.control);
		this.add(othello, BorderLayout.CENTER);
	}

	// Start the applet
	public void start() {
	}

	// Stop the applet
	public void stop() {
	}

	// Destroy the applet
	public void destroy() {
	}

	// Get Applet information
	public String getAppletInfo() {
		return "Applet Information";
	}

	// Get parameter info
	public String[][] getParameterInfo() {
		return null;
	}
}
