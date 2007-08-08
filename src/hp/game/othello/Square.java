/* Othello
 * Copyright (C) 1999,2007 Huang Peng <shawn.p.huang@gmail.com>
 *
 * Square.java
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

class Square {
	private long data = 0l;

	Square() {
		data = 0l;
	}

	Square(final Square q) {
		data = q.data;
	}

	Square(long d) {
		data = d;
	}

	void setSquare(final Square q) {
		data = q.data;
	}

	void setSquare(long d) {
		data = d;
	}

	void setChess(int x, int y) {
		if ((x > 7) || (x < 0) || (y > 7) || (y < 0)) {
			return;
		}

		data |= 1l << ((y << 3) + x);
	}

	void clearChess(int x, int y) {
		if ((x > 7) || (x < 0) || (y > 7) || (y < 0)) {
			return;
		}
		data &= ~(1l << ((y << 3) + x));
	}

	// public boolean getChess (int p) {
	// int x = p % 8;
	// int y = p / 8;
	// return getChess(x, y);
	// }

	boolean getChess(int x, int y) {
		if ((x > 7) || (x < 0) || (y > 7) || (y < 0)) {
			return false;
		}

		if ((data & (1l << ((y << 3) + x))) != 0l) {
			return true;
		} else {
			return false;
		}
	}

	boolean equals(final Square q) {
		return (q.data == data);
	}

	Square bitOr(final Square q) {

		data |= q.data;
		return this;
	}

	Square bitAnd(final Square q) {

		data &= q.data;
		return this;
	}

	boolean isEmpty() {
		return (data == 0);
	}

	public String toString() {
		String str = new String();
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (this.getChess(x, y)) {
					str += "|X";
				} else {
					str += "| ";
				}
			}
			str += "|\n";
		}
		str += "\n";
		return str;
	}
}
