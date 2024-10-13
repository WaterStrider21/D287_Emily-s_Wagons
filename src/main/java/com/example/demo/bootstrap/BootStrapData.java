package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        if (outsourcedPartRepository.count() == 0 || inhousePartRepository.count() == 0) {

//Wheels
            OutsourcedPart Wheels = new OutsourcedPart();
            Wheels.setName("Wheels");
            Wheels.setInv(5);
            Wheels.setMinInv(1);
            Wheels.setMaxInv(5);
            Wheels.setPrice(3.50);
            Wheels.setId(1300);
            Wheels.setCompanyName("WGU");
            //Wheels.setMinInv();
            outsourcedPartRepository.save(Wheels);
//handle
            OutsourcedPart Handle = new OutsourcedPart();
            Handle.setName("Handle");
            Handle.setInv(5);
            Handle.setMinInv(1);
            Handle.setMaxInv(5);
            Handle.setPrice(4.50);
            Handle.setId(1301);
            Wheels.setCompanyName("WGU");
            outsourcedPartRepository.save(Handle);

            //Bottom
            OutsourcedPart Bottom = new OutsourcedPart();
            Bottom.setName("Bottom");
            Bottom.setInv(5);
            Bottom.setMinInv(1);
            Bottom.setMaxInv(5);
            Bottom.setPrice(3.50);
            Bottom.setId(1302);
            Wheels.setCompanyName("WGU");
            outsourcedPartRepository.save(Bottom);
            //Front
            InhousePart Front = new InhousePart();
            Front.setName("Front");
            Front.setInv(5);
            Front.setMinInv(1);
            Front.setMaxInv(5);
            Front.setPrice(3.50);
            Front.setId(1303);
            inhousePartRepository.save(Front);
            //Back
            InhousePart Back = new InhousePart();
            Back.setName("Back");
            Back.setInv(5);
            Back.setMinInv(1);
            Back.setMaxInv(5);
            Back.setPrice(3.50);
            Back.setId(1304);
            inhousePartRepository.save(Back);

            //Sides
            InhousePart Sides = new InhousePart();
            Sides.setName("Sides");
            Sides.setInv(5);
            Sides.setMinInv(1);
            Sides.setMaxInv(5);
            Sides.setPrice(3.50);
            Sides.setId(1305);
            inhousePartRepository.save(Sides);

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

            List<InhousePart> inHousePart = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inHousePart) {
                System.out.println(part.getName());
            }
           /* List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))Wheels=part;
            }*/

           // System.out.println(Wheels.getCompanyName());

            //Part repository

           partRepository.saveAll(outsourcedParts);
            partRepository.saveAll(inHousePart);




        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
            if (productRepository.count() == 0) {
            Product BlueWagon = new Product(1305, "Blue Wagon", 30.50, 5);


            Product GreenWagon = new Product(1306, "Green Wagon", 30.50, 5);


            Product RedWagon = new Product(1307, "Red Wagon", 30.50, 5);


            Product BlueWagonSM = new Product(1308, "Blue Wagon Small", 25, 5);


            Product GreenWagonSM = new Product(1309, "Green Wagon Small", 25, 5);


            Product RedWagonSM = new Product(1310, "Red Wagon Small", 25, 5);



            productRepository.save(BlueWagon);
            productRepository.save(GreenWagon);
            productRepository.save(RedWagon);
            productRepository.save(BlueWagonSM);
            productRepository.save(GreenWagonSM);
            productRepository.save(RedWagonSM);
        }
            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }
}
