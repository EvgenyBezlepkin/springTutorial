package starter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;
import java.util.Random;


// прописываем логику которая возвращает boolean, от которого зависит вернется бин под этой аннотацией или нет
public class OnStarterConditional implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return true;
    }
}
