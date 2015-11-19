/*
 ============================================================================
 Name        : HelloC.c
 Author      : Ming
 Version     : 1.0
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <string.h>
#include <jni.h>

jstring Java_com_example_ndktest_MainActivity_helloWorldFromC(JNIEnv* env, jobject obj) {
	char* str = "hello world from c";
	return (*env)->NewStringUTF(env, str);
}
