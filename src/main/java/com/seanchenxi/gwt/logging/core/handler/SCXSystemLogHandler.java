/*
 * Copyright 2013 Xi CHEN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.seanchenxi.gwt.logging.core.handler;

import java.util.logging.Level;

import com.google.gwt.logging.client.SystemLogHandler;
import com.seanchenxi.gwt.logging.core.formatter.PatternFormatter;

public class SCXSystemLogHandler extends SystemLogHandler {

  public SCXSystemLogHandler(){
    setFormatter(new PatternFormatter());
    setLevel(Level.ALL);
  }
  
}
