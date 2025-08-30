public class Main {
    public static void main(String[] args) {
        int masa = 114;
        double estatura = 1.78;
        double imc = masa / Math.pow(estatura, 2);
        System.out.println("la persona tiene una masa = " + masa + " Kilogramos y estatura= " + estatura + " metros");
        if (imc < 16) {
            System.out.println("La persona tiene delgadez severa");
        } else if (imc < 17){
            System.out.println("La persona tiene delgadez moderada");
        }else if (imc < 18.5){
            System.out.println("La persona tiene delgadez leve");
        }else if (imc < 25){
            System.out.println("La persona tiene peso normal");
        }else if (imc < 30){
            System.out.println("La persona tiene sobrepeso");
        }else if (imc < 35){
            System.out.println("La persona tiene obesidad leve");
        }else if (imc < 40){
            System.out.println("La persona tiene obesidad media");
        }else {
            System.out.println("La persona tiene obesidad morbidad");
        }
    }
}