package camp.nextstep.edu.github.viewmodel

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
@MapKey
@Target(AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FUNCTION)
annotation class ViewModelKey(val value: KClass<out ViewModel>)
