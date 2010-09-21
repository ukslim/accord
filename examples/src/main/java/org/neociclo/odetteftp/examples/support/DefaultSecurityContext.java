/**
 * Neociclo Accord, Open Source B2B Integration Suite
 * Copyright (C) 2005-2010 Neociclo, http://www.neociclo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * $Id$
 */
package org.neociclo.odetteftp.examples.support;

import javax.security.auth.callback.CallbackHandler;

import org.neociclo.odetteftp.security.MappedCallbackHandler;
import org.neociclo.odetteftp.security.SecurityContext;

/**
 * @author Rafael Marins
 * @version $Rev$ $Date$
 */
public class DefaultSecurityContext implements SecurityContext {

	private MappedCallbackHandler callbackHandler;

	public DefaultSecurityContext(MappedCallbackHandler callbackHandler) {
		super();
		this.callbackHandler = callbackHandler;
	}

	public CallbackHandler getCallbackHandler() {
		return callbackHandler;
	}

}