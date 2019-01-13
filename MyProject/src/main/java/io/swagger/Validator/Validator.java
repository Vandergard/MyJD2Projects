//package io.swagger.Validator;
//
//
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Map;
//
//@Component
//public abstract class Validator {
//
//    private Map<String, List<Validatable>> rules = Map.of(
//            "paymentType.name", List.of(
//                    new ValidationRule(),
//                    new ValidationRuleMaxLength()
//            )
//    );
//
//    public boolean validate(String fieldName, Object fieldValue){
//
//        boolean result = true;
//        for(Validatable valRule:rules.get(fieldName) ){
//            result &= valRule.validate(fieldValue);
//        }
//
//
//        return result;
//    }
//
//    interface Validatable{
//        boolean validate(Object obj);
//    }
//
//    class ValidationRule implements Validator.Validatable {
//        public boolean validate(Object value) {
//           return ((String)value).length()>0;
//        }
//    }
//
//    class ValidationRuleMaxLength implements Validator.Validatable {
//        public boolean validate(Object value) {
//            return ((String)value).length()<1000;
//        }
//    }
//}
