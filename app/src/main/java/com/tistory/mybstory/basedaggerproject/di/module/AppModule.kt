package com.tistory.mybstory.basedaggerproject.di.module

import android.app.Application
import com.tistory.mybstory.basedaggerproject.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApplication(application: App): Application = application
}