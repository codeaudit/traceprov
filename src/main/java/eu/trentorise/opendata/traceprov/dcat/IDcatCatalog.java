/**
 * *****************************************************************************
 * Copyright 2013-2014 Trento Rise (www.trentorise.eu/)
 * 
* All rights reserved. This program and the accompanying materials are made
 * available under the terms of the GNU Lesser General Public License (LGPL)
 * version 2.1 which accompanies this distribution, and is available at
 * 
* http://www.gnu.org/licenses/lgpl-2.1.html
 * 
* This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
*******************************************************************************
 */
package eu.trentorise.opendata.traceprov.dcat;

import java.util.List;

/**
 * A data catalog is a curated collection of metadata about datasets, as
 * specified by
 * <a href="http://www.w3.org/TR/vocab-dcat/#class-catalog">dcat:catalog</a>
 *
 * Typically, a web-based data catalog is represented as a single instance of
 * this class.
 *
 * Following properties were not included: <br/>
 * List<DcatDataset> datasets and List<DcatCatalogRecord> records
 *
 * @author David Leoni
 */
public interface IDcatCatalog {

    /**
     * A free-text account of the catalog, as specified by
     * <a href="http://purl.org/dc/terms/description">dct:description </a>
     */
    String getDescription();

    /**
     * The homepage of the catalog. It should be unique and precisely identify
     * the catalog. This allows smushing various descriptions of the catalog
     * when different URIs are used. Specified by
     * <a href="http://xmlns.com/foaf/spec/#term_homepage">foaf:homepage</a>
     */
    String getHomepage();

    /**
     * Date of formal issuance (e.g., publication) of the catalog. Must be in a
     * <a href="http://www.w3.org/TR/NOTE-datetime">ISO 8601 Date and Time
     * compliant</a> string format i.e. "2011-12-11". Specified by
     * <a href="http://purl.org/dc/terms/issued">dct:issued</a>
     *
     * @see IDcatDataset#getIssued()
     * @see IDcatDistribution#getIssued()
     * @see IDcatCatalogRecord#getIssued()
     */
    String getIssued();

    /**
     * The languages of the catalog. This refers to the language used in the
     * textual metadata describing titles, descriptions, etc. of the datasets in
     * the catalog. The publisher might also choose to describe the language on
     * the dataset level.
     *
     * Language codes defined by the Library of Congress
     * (<a href="http://id.loc.gov/vocabulary/iso639-1.html">ISO 639-1</a>,
     * <a href="http://id.loc.gov/vocabulary/iso639-2.html">ISO 639-2</a>)
     * should be used. If a ISO 639-1 (two-letter) code is defined for language,
     * then its corresponding IRI should be used; if no ISO 639-1 code is
     * defined, then IRI corresponding to the ISO 639-2 (three-letter) code
     * should be used.
     *
     * @see IDcatDataset#getLanguage()
     */
    List<String> getLanguages();

    /**
     * This links to the license document under which the <b>catalog</b> is made
     * available and <b>not the datasets</b>. Even if the license of the catalog
     * applies to all of its datasets and distributions, it should be replicated
     * on each distribution. Specified by <a href=""> dct:license </a>
     */
    String getLicense();

    /**
     * Most recent date on which the catalog was changed, updated or modified.
     * Must be in a
     * <a href="http://www.w3.org/TR/NOTE-datetime">ISO 8601 Date and Time
     * compliant</a> string format i.e. "2011-12-11" . Specified by
     * <a href="http://purl.org/dc/terms/modified">dct:modified</a>
     */
    String getModified();

    /**
     * The entity responsible for making the catalog online.
     *
     * @see IFoafAgent
     * @see IFoafPerson
     * @see IFoafOrganization
     */
    IFoafAgent getPublisher();

    /**
     * This describes the rights under which <b>the catalog</b> can be
     * used/reused and <b> not the datasets </b>. Even if these rights apply to
     * all the catalog datasets and distributions, it should be replicated on
     * each distribution. Specified by
     * <a href="http://purl.org/dc/terms/rights">dct:rights</a>.
     *
     * @see #getLicense()
     * @see IDcatDistribution#getRights()
     */
    String getRights();

    /**
     * Returns the geographical area covered by the catalog, as defined by
     * <a href="http://purl.org/dc/terms/spatial">dct:spatial</a>
     */
    String getSpatial();

    /**
     * The taxonomy of categories used to classify catalog's datasets, as specified by <a href="http://www.w3.org/TR/vocab-dcat/#Property:catalog_themes"> dcat:themeTaxonomy </a>. Note the
     * property name in the specs is 'themes' but 'categories' is also used as
     * synonim in other places of the specs and seems more natural.
     * 
     * @see IDcatDataset#getCategory() 
     */
    ISkosConceptScheme getCategories();

    /**
     * A name given to the catalog, as specified by
     * <a href="http://purl.org/dc/terms/title">dct:title</a>
     */
    // todo put example
    String getTitle();

    /**
     * Property not in DCAT spec. This should uniquely identify the catalog,
     * giving the same result as {@link #getHomepage()}
     */
    String getUri();

}
