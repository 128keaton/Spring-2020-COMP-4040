using System;

namespace Quiz4 {
    public static class Question3 {
        public static void Main(string[] args) {
            int arrayLength = 20;
            int [] outputArray = new int[arrayLength];

            for (int i = 0; i < arrayLength; i++ ) {
                outputArray[i] = i * 5;
            }

            for (int i = 0; i < arrayLength; i++ ) {
                Console.WriteLine(outputArray[i]);
            }
        }
    }
}
