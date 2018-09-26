package javaworldspringmvc.repository;

import javaworldspringmvc.model.Widget;
import org.springframework.data.repository.CrudRepository;

public interface WidgetRepository extends CrudRepository<Widget, Long> {
}
