@RestController
@RequestMapping("/supplier-profile")
public class SupplierProfileController {

    private final SupplierProfileService supplierProfileService;

    public SupplierProfileController(SupplierProfileService supplierProfileService) {
        this.supplierProfileService = supplierProfileService;
    }

    @GetMapping
    public String getProfile() {
        return supplierProfileService.getSupplierProfile();
    }
}
