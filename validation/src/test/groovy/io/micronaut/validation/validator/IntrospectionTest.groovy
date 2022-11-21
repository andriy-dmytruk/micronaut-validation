package io.micronaut.validation.validator

import io.micronaut.core.beans.BeanIntrospection;
import spock.lang.Specification

class IntrospectionTest extends Specification {
    void "test generic annotations present"() {
        given:
        def introspection = BeanIntrospection.getIntrospection(Book.class)
        def property = introspection.getBeanProperties().first()
        def typeParameter = property.asArgument().getTypeParameters()[0]

        expect:
        typeParameter.annotationMetadata.hasStereotype("javax.validation.Valid")
    }
}
