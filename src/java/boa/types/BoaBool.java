/*
 * Copyright 2014, Anthony Urso, Hridesh Rajan, Robert Dyer, 
 *                 and Iowa State University of Science and Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package boa.types;

/**
 * A {@link BoaScalar} representing a true/false value.
 * 
 * @author anthonyu
 */
public class BoaBool extends BoaScalar {
	/** {@inheritDoc} */
	@Override
	public boolean accepts(final BoaType that) {
		return this.assigns(that);
	}

	/** {@inheritDoc} */
	@Override
	public String toJavaType() {
		return "boolean";
	}

	/** {@inheritDoc} */
	@Override
	public String toBoxedJavaType() {
		return "Boolean";
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "bool";
	}
}
