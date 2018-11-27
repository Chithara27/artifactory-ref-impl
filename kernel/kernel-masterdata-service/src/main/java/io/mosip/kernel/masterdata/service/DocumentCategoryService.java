package io.mosip.kernel.masterdata.service;

import io.mosip.kernel.masterdata.dto.DocumentCategoryDto;
import io.mosip.kernel.masterdata.dto.DocumentCategoryRequestDto;
import io.mosip.kernel.masterdata.dto.DocumentCategoryResponseDto;
import io.mosip.kernel.masterdata.dto.PostResponseDto;

/**
 * This interface have methods to fetch list of document category and to create
 * document categories based on list provided.
 * 
 * @author Neha
 * @author Ritesh Sinha
 * @since 1.0.0
 *
 */
public interface DocumentCategoryService {

	/**
	 * To fetch all Document Category
	 * 
	 * @return {@linkplain DocumentCategoryDto}
	 */
	public DocumentCategoryResponseDto getAllDocumentCategory();

	/**
	 * To fetch all Document Category using language code
	 * 
	 * @param langCode
	 *            the language code
	 * @return {@linkplain DocumentCategoryDto}
	 */
	public DocumentCategoryResponseDto getAllDocumentCategoryByLaguageCode(String langCode);

	/**
	 * To fetch Document Category using id and language code
	 * 
	 * @param code
	 * @param langCode
	 * @return {@linkplain DocumentCategoryDto}
	 */
	public DocumentCategoryResponseDto getDocumentCategoryByCodeAndLangCode(String code, String langCode);

	/**
	 * Method to create Document Categories based on list provided
	 * 
	 * @param category
	 *            dto with document categories list.
	 * @return {@linkplain PostResponseDto}
	 */
	public PostResponseDto addDocumentCategoriesData(DocumentCategoryRequestDto category);
}
