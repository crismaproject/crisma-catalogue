/*
 * ***************************************************
 * 
 * cismet GmbH, Saarbruecken, Germany
 * 
 *               ... and it just works.
 * 
 * ***************************************************
 */
package eu.crismaproject;

import java.util.List;

/**
 * A Functional Building Block of the CRISMA Framework Architecture.
 *
 * @author Pascal Dihé <pascal.dihe@cismet.de>
 */
public class BuildingBlock
{
    /**
     * Enumeration of Building Block Types
     */
    public enum BuildingBlockType
    {
        Infrastructure, Integration, UserInteraction, SimulationModel
    }
    
    /**
     * The type of the Building Block: Infrastructure Building Block,
     * Integration Building Block, User Interaction Building Block,
     * CRISMA Simulation Model
     */
    public BuildingBlockType type;
    
    /**
     * Short description (summary) of this Building Block. 
     * Plaintext, maximum 3-5 lines.
     */
    public String summary;
    
    /**
     * Long description of the Building Block. May include formatted text, 
     * pictures, etc. The description should describe the key functionality
     * of the Building Block and its position in the CRISMA Framework Architecture
     */
    public String description;
    
    public List<BuildingBlock> realtedBuildingBlocks
    
    /**
    * Software Components for this Building Block that have been selected, extended or implemented by
    * the CRISMA Consortium.
    */
    public List<SoftwareComponent> softwareComponents;
  
}
