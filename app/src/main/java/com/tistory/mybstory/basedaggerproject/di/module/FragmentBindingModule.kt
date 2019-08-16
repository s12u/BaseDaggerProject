package com.tistory.mybstory.basedaggerproject.di.module

import com.tistory.mybstory.basedaggerproject.di.scope.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

//    @FragmentScope
//    @ContributesAndroidInjector(modules = [SomeFragmentModule::class])
//    abstract fun bindFragment(): BaseFragment
}