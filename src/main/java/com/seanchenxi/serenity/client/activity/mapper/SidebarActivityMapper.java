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
package com.seanchenxi.serenity.client.activity.mapper;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.seanchenxi.serenity.client.SerenityFactory;
import com.seanchenxi.serenity.client.activity.SidebarActivity;
import com.seanchenxi.serenity.client.place.SerenityPlace;

public class SidebarActivityMapper implements ActivityMapper {

	private final SidebarActivity sidebarActivity;

	public SidebarActivityMapper(SerenityFactory clientFactory) {
		this.sidebarActivity = new SidebarActivity(clientFactory);
	}

	@Override
	public Activity getActivity(Place place) {
		if(place instanceof SerenityPlace){
			sidebarActivity.updateForPlace((SerenityPlace) place);
			return sidebarActivity;
		}
		return null;
	}

}
