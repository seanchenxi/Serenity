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
package com.seanchenxi.serenity.client.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface AboutView extends IsWidget {
	
	void setId(int id);
	void setTitle(String title);
	void setContent(String content);

	void addTag(String slug, String name);

	void clearContent();
	
	void bindPresenter(Presenter presenter);
	
	public interface Presenter {
		void closeView();
	}
	
}
