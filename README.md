Yahoo Bookmark for Android
============================

Bookmark of the Web Site.


License
=======

	Yahoo Bookmark is free software: you can redistribute it and/or modify
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
	Translators: <Please add your email here>

	

Building
========

**On Windows**
Get the Android SDK http://developer.android.com/sdk/index.html
Get the Apache Ant™ http://ant.apache.org/bindownload.cgi
Get the GitHub http://windows.github.com/

```bash
mkdir %ProgramFiles32%\apache\ant
set PATH=PATH;%ProgramFiles(x86)%\android\tools\;%ProgramFiles(x86)%\android\plataform-tools\;%ProgramFiles32%\apache\ant
set JAVA_HOME=%ProgramFiles(x86)%\java\jdk#.#.#_##
rem android create project --target 1 --name Siragon --path <path> --activity MainActivity --package com.yahoo.bookmark
cd  %HOMEPATH%\Documents\GitHub\yahoo-bookmark-android
ant debug
adb install -r bin\Siragon-debug.apk
```