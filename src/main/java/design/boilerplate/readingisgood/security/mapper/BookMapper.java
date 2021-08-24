package design.boilerplate.readingisgood.security.mapper;

import design.boilerplate.readingisgood.model.Book;
import design.boilerplate.readingisgood.security.dto.BookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {

	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	Book convertToBook(BookRequest bookRequest);


}
