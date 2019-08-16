package com.tistory.mybstory.basedaggerproject.di.module

import com.tistory.mybstory.basedaggerproject.di.scope.ActivityScope
import com.tistory.mybstory.basedaggerproject.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentBindingModule::class])
    abstract fun bindMainActivity(): MainActivity
}