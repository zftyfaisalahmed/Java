package InheritedSpeicalOverride;

class Dog {
    void DogName() {
        System.out.println("Dog name is Tonny");
    }

    void DogColor() {
        System.out.println("The Colour of the Dog is Brown");
    }

    void DogBreed() {
        System.out.println("Dog Breed is BR");
    }
}

class BrBreed extends Dog {
    @Override
    void DogName() {
        System.out.println("Dog name is Jipsy");
    }

    void DogColor() {
        System.out.println("Dog colour is White");
    }

    void DogAge() {
        System.out.println("Age is 3 years");
    }
}

class ShitzuBreed extends Dog {
    @Override
    void DogName() {
        System.out.println("Dog name is Tommy");
    }

    void DogColor() {
        System.out.println("Dog colour is Black");
    }

    void DogBreed() {
        System.out.println("Dog Breed is Shitzu");
    }

    void DogAge() {
        System.out.println("Age is 5 years");
    }
}

class GrBreed extends Dog {
    @Override
    void DogName() {
        System.out.println("Dog name is Tipsy");
    }

    void DogColor() {
        System.out.println("Dog colour is Yellow");
    }

    void DogAge() {
        System.out.println("Age is 7 years");
    }
}

public class ReferenceOverride2 {
    public static void main(String[] args) {
        BrBreed bb = new BrBreed();
        ShitzuBreed sb = new ShitzuBreed();
        GrBreed gr = new GrBreed();

        Dog ref;

        System.out.println("BR Bread Details : ");
        ref = bb;
        ref.DogName();
        ref.DogColor();
        ref.DogBreed();
        bb.DogAge();// We Cannot have parent type reference to the specilaized methods of the child
        // class
        System.out.println("================");

        System.out.println("Shitzu Bread Details : ");
        ref = sb;
        ref.DogName();
        ref.DogColor();
        ref.DogBreed();
        sb.DogAge();
        System.out.println("================");

        System.out.println("GR Bread Details : ");
        ref = gr;
        ref.DogName();
        ref.DogColor();
        ref.DogBreed();
        gr.DogAge();
        System.out.println("================");
    }
}
