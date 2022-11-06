package lab1;

public class Problem3 {

    /**
     * Метод solveKnapsackProblem решает классическую задачу о рюкзаке:
     * https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%B0_%D0%BE_%D1%80%D1%8E%D0%BA%D0%B7%D0%B0%D0%BA%D0%B5
     *
     * Пусть даны n предметов с индексами 0, 1, ..., n-1.
     * @param values массив положительных чисел длины n, определяющий ценности n предметов
     * @param weights массив положительных чисел длины n, определяющий массы n предметов
     * @param maximumWeightCapacity положительное число, определяющее грузоподъемность рюкзака
     * @return максимальное значение общей ценности предметов, которые можно положить в рюкзак с учетом ограничения
     *         на грузоподъемность.
     *
     * ПРИМЕР:
     * Вход: values = [2.0, 1.0, 5.0]
     *       weights = [1.0, 1.0, 2.0]
     *       maximumWeightCapacity = 2.5
     * Выход: 5.0 (максимальная ценность достигается при выборе одного предмета с индексом 2)
     */
    public static double solveKnapsackProblem(double[] values, double[] weights, double maximumWeightCapacity) {
        // TODO: implement this method
        // double temp = maximumWeightCapacity*1000;
        // for(int k=0;k<values.length;k++){
        //     values[k]*=1000;
        //     weights[k]*=1000;
        // }
        // int maximumWeightCapacityInt = (int)temp;
        // int valuesInt[] = new int[values.length];
        // int weightsInt[] = new int[weights.length];
        // for(int k=0;k<values.length;k++){
        //     valuesInt[k]=(int)values[k];
        //     weightsInt[k]=(int)weights[k];
        // }
        // double[][] m = new double[maximumWeightCapacityInt][maximumWeightCapacityInt];
        // for (int j=0; j<maximumWeightCapacity; j++){
        //     m[j][j]=0.;
        // }

        // for(int i=1;i<valuesInt.length; i++){
        //     for(int j=0; j<maximumWeightCapacityInt;j++){
        //         if(weightsInt[i]>j){
        //             m[i][j]=m[i-1][j];
        //         }
        //         else{
                    
        //             m[i][j]=Math.max(m[i-1][j], m[i-1][j-weightsInt[i]+valuesInt[i]]);
        //         }
        //     }
        // }
        return 0;
    }

}