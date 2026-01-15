package com.solrion.core.client;

/**
 * Allows customization of HTTP paths for Solr operations. Useful for non-standard Solr endpoints or
 * special backend behaviors.
 */
@FunctionalInterface
public interface PathResolver {

  /**
   * Resolves the full HTTP path for a given operation.
   *
   * @param basePath the base path (e.g., "/solr")
   * @param collection the collection name
   * @param operation the operation type
   * @return the resolved path (e.g., "/solr/collection/select")
   */
  String resolve(String basePath, String collection, ClientOperation operation);
}
