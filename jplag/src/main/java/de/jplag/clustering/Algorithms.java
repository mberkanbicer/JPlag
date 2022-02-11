package de.jplag.clustering;

import de.jplag.clustering.algorithm.AgglomerativeClustering;
import de.jplag.clustering.algorithm.SpectralClustering;

/**
 * Choosable clustering algorithms
 */
public enum Algorithms {
    /** {@link AgglomerativeClustering} */
    AGGLOMERATIVE,
    /** {@link SpectralClustering} */
    SPECTRAL
}
