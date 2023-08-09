package com.pog.count.Service;

import com.pog.count.Entity.Recibo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Collections;
import java.util.List;

@Service
public class ReciboService {

    public Recibo calculo(final List<BigDecimal> nums) {

        Recibo recibo = new Recibo(media(nums), desvioPadrao(nums), mediana(nums), nums.size());

        return recibo;
    }

    public BigDecimal media (final List<BigDecimal> nums){
        BigDecimal total = BigDecimal.ZERO;
        for (BigDecimal num : nums)
        {
            System.out.println(num);
            total = total.add(num);
        }

        BigDecimal media = total.divide(new BigDecimal(nums.size()));
        return media;
    }

    public BigDecimal mediana(final List<BigDecimal> nums){

        Collections.sort(nums);

        int meio_index = nums.size() / 2;

        if (nums.size() % 2 == 1) {
            return nums.get(meio_index);
        } else {
            BigDecimal primeiro_meio = nums.get(meio_index - 1);
            BigDecimal segundo_meio = nums.get(meio_index);
            return primeiro_meio.add(segundo_meio).divide(BigDecimal.valueOf(2));
        }

    }

    public BigDecimal desvioPadrao(List<BigDecimal> nums){
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal num : nums) {
            sum = sum.add(num);
        }
        BigDecimal mean = sum.divide(BigDecimal.valueOf(nums.size()), MathContext.DECIMAL128);

        BigDecimal squaredDifferencesSum = BigDecimal.ZERO;
        for (BigDecimal num : nums) {
            BigDecimal difference = num.subtract(mean);
            squaredDifferencesSum = squaredDifferencesSum.add(difference.pow(2));
        }

        BigDecimal var = squaredDifferencesSum.divide(BigDecimal.valueOf(nums.size()), MathContext.DECIMAL128);

        return BigDecimal.valueOf(Math.sqrt(var.doubleValue())).setScale(3, BigDecimal.ROUND_HALF_EVEN);
    }


}
