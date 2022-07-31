package com.company;                                    //работает ClassLoaders
                                                        // в нашем случае в *Metaspace*  будут подгружены
                                                        // классы - "class
                                                        // JvmComprehension" , "System" , "Object" , "Integer"
    public class JvmComprehension {
                                                          //работает Runtime Data Area
        public static void main(String[] args) {          // в Stack Memory будет создан фрейм метода main
            int i = 1;                                    // внутри фрейма метода main будет сохранена переменная int i = 1
            Object o = new Object();                      // *new Object()*-создастся объект в heap и переменная
            // (ссылка на него в Stack )
            Integer ii = 2;                                     // будет создастся Integer объект в heap и переменная
            // (ссылка на него в Stack )
            printAll(o, i, ii);                                 // в Stack создаётся фрейм для метода printAll в нём
                                                                // создадутся переменные ссылочного типа ii и o и
                                                                // переменная int i = 1;
            System.out.println("finished");                     // в Stack создаётся фрейм для метода println
        }

        private static void printAll(Object o, int i, Integer ii) {
            Integer uselessVar = 700;                            //  будет создаваться Integer объект в heap и переменная
            // (ссылка на него в Stack)
            System.out.println(o.toString() + i + ii);           // в Stack создаётся фрейм для метода println
            // и toString в нём
            // создадутся переменные ссылочного типа ii и
            // o и переменная int i = 1;
        }
    }

