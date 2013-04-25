/* 	Yahoo Bookmark is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	Yahoo Bookmark is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with Yahoo Bookmark. If not, see <http://www.gnu.org/licenses/>.

	Original Author: Síragon I&D <desarrollo03@siragon.com.ve>

	Developers: <Please add your email here>
	Contributors: <Please add your email here>
	Translators: <Please add your email here> */

package com.yahoo.bookmark;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent; 
import android.net.Uri;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://es.yhs4.search.yahoo.com/yhs/mobile/web?&hspart=appattach&hsimp=yhsm-appattach&type=233"));
		startActivity(browserIntent);
		finish();
        System.exit(0);
    }
	private static final String BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhxw85rbLEMFmPKIRWOw/xwRNP089+lh5hLBt+BakP/mLjuTi4v2/6wVamoeK2+F3xCWrimhJM7zIDaRnL+erfCvGKVxPksfSEM85+A3hHB16Y1g1YecKt9vBV6Wc1ype48XpI+X+Uk12+f2k1c/M+s4Uvn5hen6G4pnami+Jd5EyDJhqBsdYeDL6u4qCO+07eCGTeQeUoox4woDdRPV0CrrXrH+ffvOSssf12RB1LsV+zpGkmdY91GlVi5VZrfYqwUi1tY4gShhv/aP/PliLidE6MmaWRqXojm1abwdRqB7gh9mn7pTYzQ7RgXAD2aery+B/UX6gU2WA9xb5tGYkiQIDAQAB";
}