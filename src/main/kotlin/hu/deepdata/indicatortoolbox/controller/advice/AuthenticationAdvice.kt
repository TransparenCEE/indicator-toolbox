/*
 *    Copyright 2018 DeepData Ltd.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package hu.deepdata.indicatortoolbox.controller.advice

import org.springframework.web.bind.annotation.*
import java.security.*

/**
 * Populates "nick" model attribute to every page, which
 * will contain the current authenticated user's name.
 *
 * @author Zsolt Jurányi
 */
@ControllerAdvice
class AuthenticationAdvice {

	@ModelAttribute("nick")
	fun username(p: Principal?): String? {
		return p?.name
	}
}