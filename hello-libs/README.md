Hello-libs
=========
Hello-Libs is an Android sample that demos 3rd party native lib management with Android Studio

Introduction
------------
This sample uses the new [Android Studio CMake plugin](http://tools.android.com/tech-docs/external-c-builds) with external lib support.
* how external pre-build static lib (gmath) could be used in app
* how external pre-built shared lib (gperf) could be used in app

Description
-----------
The sample includes 2 modules but only uses app module:
*    app -- uses one shared lib and one static lib from $project/distribution/
*    gen-libs -- generates one shared and one static lib, and copy them into $project/distribution
For this demo purpose, you do not need to build libs: binaries are included in the project -- the 
debug library binaries are saved inside distribution folder. If you want, you could build your own with
gen-libs source, just follow comment in setting.gradle and app/build.gradle  -- do it once, then
comment them out again so you are not affected by lib building

The key point is to inform app's CMakeLists.txt
*    where lib/header are
*    where lib binaries are and import them as static or shared

Note: for shared lib, with android plugin 2.2.0-alpha3+, once declared as SHARED IMPORTED, Android
Studio will automatically pack them into apk too! So lib just need tell Android Studio once, it
will be used both on Host and on Target

修改说明
--------------
参照原来项目的 JNI 编译配置方式，添加了一个 JNI 层的 library 项目，即 Application 项目只需要依赖 library 项目的 aar 文件即可达到调用底层 so 文件的目的，提供 C/C++ 项目移植到 Android 平台的参考配置模板。

踩坑点：
1. 在 CMakeLists.txt 中配置第三方库文件(libs 和 include) 一定要注意路径是否正确. 一般以 CMakeLists.txt 所在路径配置相对路径。
2. 在 JNI 中 Java 声明的 Native 方法对应到 CPP 文件中时方法签名头部需要添加 extern "C"。
3. 在 JNI library 中的 build.gradle 要添加 jniLins = 第三方 so 库路径。



Pre-requisites
--------------
- Android Studio 2.2+ with [NDK](https://developer.android.com/ndk/) bundle.

Getting Started
---------------
1. [Download Android Studio](http://developer.android.com/sdk/index.html)
1. Launch Android Studio.
1. Open the sample directory.
1. Open *File/Project Structure...*
  - Click *Download* or *Select NDK location*.
1. Click *Tools/Android/Sync Project with Gradle Files*.
1. Click *Run/Run 'app'*.

Screenshots
-----------
![screenshot](screenshot.png)

Support
-------
If you've found an error in these samples, please [file an issue](https://github.com/googlesamples/android-ndk/issues/new).

Patches are encouraged, and may be submitted by [forking this project](https://github.com/googlesamples/android-ndk/fork) and
submitting a pull request through GitHub. Please see [CONTRIBUTING.md](../CONTRIBUTING.md) for more details.

- [Stack Overflow](http://stackoverflow.com/questions/tagged/android-ndk)
- [Google+ Community](https://plus.google.com/communities/105153134372062985968)
- [Android Tools Feedbacks](http://tools.android.com/feedback)

License
-------
Copyright 2015 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
