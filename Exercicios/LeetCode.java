class LeetCode {
    public int[] twoSum(int[] nums, int target){

        for(int i = 0; i < nums.length ; i++){
            for(int j = i +1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return nums;
    }
}

//logica para o exercicio:
/*um for i para ler todos os valores e um for j  dentro do for i (aninhado)
para  Testar esse número com os próximos e um if pra verificar se a soma é igual a target */ 